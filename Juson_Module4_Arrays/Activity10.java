        System.out.println("\nClass-Level Analysis:");
        System.out.println("Overall Class Average: " + (totalSum / numSubjects));
        System.out.println("Subject with Highest Average: Subject " + (highSub + 1));
        System.out.println("Subject with Lowest Average: Subject " + (lowSub + 1));

        // Sorting and ranking
        Arrays.sort(studentAverages);
        System.out.println("\nRanked Averages (Descending):");
        for (int i = studentAverages.length - 1; i >= 0; i--) {
            System.out.println("Rank " + (studentAverages.length - i) + ": " + studentAverages[i]);
        }

        // E. Matrix Transformation
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(gradebook[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Matrix (Subjects as Rows):");
        for (int j = 0; j < numSubjects; j++) {
            for (int i = 0; i < numStudents; i++) {
                System.out.print(gradebook[i][j] + " ");
            }
            System.out.println();
        }
    }
}