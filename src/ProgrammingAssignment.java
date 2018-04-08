import com.oracle.tools.packager.IOUtils;

import java.io.*;
import java.util.Scanner;

public class ProgrammingAssignment {

    public static void main(String args[])
    {
        //InsertionSort
        int fileNumber = 8;
        int cost = 0;
        while (fileNumber <= 16384)
        {
            String line;
            try
            {
                FileReader fileReader = new FileReader(ProgrammingAssignment.class.getResource("resources/PARTONE/Num" + fileNumber + ".txt").getFile());

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int[] array = new int[fileNumber];
                int index = 0;

                while ((line = bufferedReader.readLine()) != null && !line.isEmpty())
                {
                    array[index] = Integer.parseInt(line);
                    index++;
                }

                cost = SortingAlgorithms.insertionSort(array, array.length);
                for (int i = 0; i < fileNumber; i++)
                {
                    System.out.print(array[i] + " ");
                }

                System.out.println();
                bufferedReader.close();
                System.out.println("The cost (Insertion sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file");
            }


            fileNumber = fileNumber * 2;
        }

        //QuickSort
        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 16384)
        {

            String line;

            try
            {
                FileReader fileReader = new FileReader(ProgrammingAssignment.class.getResource("resources/PARTONE/Num" + fileNumber + ".txt").getFile());

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int[] array = new int[fileNumber];
                int index = 0;

                while ((line = bufferedReader.readLine()) != null && !line.isEmpty())
                {
                    array[index] = Integer.parseInt(line);
                    index++;
                }

                cost = SortingAlgorithms.quickSort(array).toInt();

                for (int i = 0; i < fileNumber; i++)
                {
                    System.out.print(array[i] + " ");
                }

                System.out.println();

                bufferedReader.close();


                System.out.println("The cost (Quick Sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file");
            }

            fileNumber = fileNumber * 2;
        }

        //HeapSort
        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 16384)
        {
            String line;

            try
            {
                FileReader fileReader = new FileReader(ProgrammingAssignment.class.getResource("resources/PARTONE/Num" + fileNumber + ".txt").getFile());

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int[] array = new int[fileNumber];
                int index = 0;


                while ((line = bufferedReader.readLine()) != null && !line.isEmpty())
                {
                    array[index] = Integer.parseInt(line);
                    index++;
                }


                cost = SortingAlgorithms.heapSort(array).toInt();

                for (int i = 0; i < fileNumber; i++)
                {
                    System.out.print(array[i] + " ");
                }

                System.out.println();

                bufferedReader.close();

                System.out.println("The cost (Heap Sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file");
            }

            fileNumber = fileNumber * 2;
        }

        //MergeSort
        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 16384)
        {
            String line;

            try
            {
                FileReader fileReader = new FileReader(ProgrammingAssignment.class.getResource("resources/PARTONE/Num" + fileNumber + ".txt").getFile());

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int[] array = new int[fileNumber];
                int index = 0;

                while ((line = bufferedReader.readLine()) != null && !line.isEmpty())
                {
                    array[index] = Integer.parseInt(line);
                    index++;
                }

                cost = SortingAlgorithms.mergeSort(array).toInt();

                for (int i = 0; i < fileNumber; i++)
                {
                    System.out.print(array[i] + " ");
                }

                System.out.println();

                bufferedReader.close();

                System.out.println("The cost (Merge Sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file");
            }

            fileNumber = fileNumber * 2;
        }

        //Part 2
        System.out.println("-----------------PART 2---------------------");

        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 256)
        {

            String line;
            try
            {
                FileReader fileReader = new FileReader(ProgrammingAssignment.class.getResource("resources/PARTTWO/Num" + fileNumber + ".txt").getFile());

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int[] array = new int[fileNumber];
                int index = 0;

                while ((line = bufferedReader.readLine()) != null && !line.isEmpty())
                {
                    array[index] = Integer.parseInt(line);
                    index++;
                }
                //buckeetsort

                for (int i = 0; i < fileNumber; i++)
                {
                    System.out.print(array[i] + " ");
                }

                System.out.println();

                bufferedReader.close();

                System.out.println("The cost (Bucket sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file");
            }

            fileNumber = fileNumber * 2;
        }




        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 256)
        {

            String line;
            try
            {
                FileReader fileReader = new FileReader(ProgrammingAssignment.class.getResource("resources/PARTTWO/Num" + fileNumber + ".txt").getFile());

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int[] array = new int[fileNumber];
                int index = 0;

                while ((line = bufferedReader.readLine()) != null && !line.isEmpty())
                {
                    array[index] = Integer.parseInt(line);
                    index++;
                }

                cost = SortingAlgorithms.radixSort(array, fileNumber).toInt();

                for (int i = 0; i < fileNumber; i++)
                {
                    System.out.print(array[i] + " ");
                }

                System.out.println();

                bufferedReader.close();

                System.out.println("The cost (Radix sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file");
            }

            fileNumber = fileNumber * 2;
        }


    }


}