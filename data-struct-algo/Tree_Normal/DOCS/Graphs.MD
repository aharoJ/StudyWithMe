# Tree

![What is a Tree](<z/Screenshot 2024-01-30 at 6.32.37 PM.png>)
![What is a Binary Tree](<z/Screenshot 2024-01-30 at 6.59.23 PM.png>)
![Structure of TreeNode](<z/Screenshot 2024-01-30 at 7.02.00 PM.png>)

# PreOrder


## Recursive Preorder traversal of a Binary Tree in Java
![Alt text](<z/Screenshot 2024-01-30 at 8.18.57 PM.png>)

![Alt text](<z/Screenshot 2024-01-30 at 8.13.54 PM.png>)

```java
TreeNode first= new TreeNode(1);
TreeNode second= new TreeNode(2);
TreeNode third= new TreeNode(3);
TreeNode fourth= new TreeNode(4);
TreeNode fifth= new TreeNode(5);

root= first;
first.left= second;
first.right= third;

second.left= fourth;
second.right= fifth;
```


## Iterative Preorder traversal of a Binary Tree in Java
![Alt text](<z/Screenshot 2024-02-01 at 12.53.44 AM.png>)
```java
        if (root==null){ return; }

        Stack<TreeNode> stack= new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) 
        {
            TreeNode temp= stack.pop();
            System.out.print(temp.data + " ");
            
            if (temp.right !=null){
                stack.push(temp.right);
            }

            if (temp.left !=null){
                stack.push(temp.left);
            }
            
        }
```



# InOrder
![Alt text](<z/Screenshot 2024-02-01 at 1.09.38 AM.png>)
![Alt text](<z/Screenshot 2024-02-01 at 1.18.02 AM.png>)








