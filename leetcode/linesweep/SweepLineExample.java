package linesweep;

import java.util.*;

class LineSegment {
    int start;
    int end;

    public LineSegment(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class SweepLineExample {

    public static void findIntersections(LineSegment[] segments) {
        // Create an event for every line segment's start and end points
        List<int[]> events = new ArrayList<>();
        for (LineSegment seg : segments) {
            events.add(new int[] { seg.start, 1 }); // Starting point event
            events.add(new int[] { seg.end, -1 }); // Ending point event
        }

        // Sort events by position
        events.sort((a, b) -> a[0] - b[0]);

        int activeSegments = 0;
        for (int[] event : events) {
            if (event[1] == 1) {
                activeSegments++; // Add a segment
            } else {
                activeSegments--; // Remove a segment
            }
            // Output the number of active segments at each event point
            System.out.println("At position " + event[0] + ", active segments: " + activeSegments);
        }
    }

    public static void main(String[] args) {
        LineSegment[] segments = {
                new LineSegment(1, 5),
                new LineSegment(2, 6),
                new LineSegment(4, 8)
        };

        findIntersections(segments);
    }
}
