# Gio solution

## recursively

```java
class Solution {

    // Ommitted for clarity and to not be cut off by discord
    private static Map<Integer, List<Character>> mapping = getDigitToLetterMapping();

    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1) {
            return List.of();
        }

        return letterCombinationsHelper(0, digits)
            .stream()
            .map(sb -> sb.reverse().toString())
            .toList();
    }

    private List<StringBuilder> letterCombinationsHelper(int currDigitIndex, String digits) {
        // Mapping from phone digit button to letters
        List<Character> possibilities = this.mapping.get(digits.charAt(currDigitIndex) - '0');

        // The result for the current digit + the digits after it
        List<StringBuilder> results = new ArrayList<>();

        // Usable for any time we create a temp StringBuilder
        StringBuilder tmpBuilder;

        // If there is only 1 digit, then the only letters possible are those
        // for that number
        if (currDigitIndex == digits.length() - 1) {
            for (char possibility : possibilities) {
                tmpBuilder = new StringBuilder();
                tmpBuilder.append(possibility);
                results.add(tmpBuilder);
            }
            return results;
        }

        // Concat the previous possible letter combinations to the current digit's possibilities
        // (This will be reversed later to mimic insert to front from O(n) to O(1))
        List<StringBuilder> prevResults = letterCombinationsHelper(currDigitIndex + 1, digits);
        for (StringBuilder prevResult : prevResults) {
            for (Character possibility : possibilities) {
                tmpBuilder = new StringBuilder(prevResult);
                tmpBuilder.append(possibility);
                results.add(tmpBuilder);
            }
        }
        return results;
    }
}
```

## Iteratively

```java
class Solution {

    private static Map<Character, String> mapping = getDigitToLetterMapping();

    private static Map<Character, String> getDigitToLetterMapping() {
        Map<Character, String> mapping = new HashMap<>();
        mapping.put('0', " ");
        mapping.put('1', "");
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");
        return mapping;
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        String representation;
        for (char digit : digits.toCharArray()) {
            representation = this.mapping.get(digit);
            result = concatenation(result, representation);
        }
        return result;
    }

    private List<String> concatenation(List<String> combinations, String representation) {
        List<String> concatenation = new ArrayList<>();

        // Empty strs ==> return group2 as List<String>
        if (combinations.size() == 0) {
            for (char c : representation.toCharArray()) {
                concatenation.add(String.format("%c", c));
            }
            return concatenation;
        }

        for (String combination : combinations) {
            for (char letter : representation.toCharArray()) {
                concatenation.add(combination + letter);
            }
        }
        return concatenation;
    }
}
```
