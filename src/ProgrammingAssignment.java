import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProgrammingAssignment {

    public static void main(String args[])
    {
        //InsertionSort
        int fileNumber = 8;
        int cost = 0;
        while (fileNumber <= 16384)
        {
            String fileName = "resources/Num" + fileNumber + ".txt";
            String line;

            try
            {
                FileReader fileReader = new FileReader(fileName);

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
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file '" + fileName + "'");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file '" + fileName + "'");
            }

            System.out.println("The cost (Insertion sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            fileNumber = fileNumber * 2;
        }

        //QuickSort
        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 16384)
        {
            String fileName = "resources/Num" + fileNumber + ".txt";
            String line;

            try
            {
                FileReader fileReader = new FileReader(fileName);

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
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file '" + fileName + "'");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file '" + fileName + "'");
            }

            System.out.println("The cost (Quick Sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            fileNumber = fileNumber * 2;
        }

        //HeapSort
        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 16384)
        {
            String fileName = "resources/Num" + fileNumber + ".txt";
            String line;

            try
            {
                FileReader fileReader = new FileReader(fileName);

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
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file '" + fileName + "'");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file '" + fileName + "'");
            }

            System.out.println("The cost (Heap Sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            fileNumber = fileNumber * 2;
        }

        //MergeSort
        fileNumber = 8;
        cost = 0;
        while (fileNumber <= 16384)
        {
            String fileName = "resources/Num" + fileNumber + ".txt";
            String line;

            try
            {
                FileReader fileReader = new FileReader(fileName);

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
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("Unable to open file '" + fileName + "'");
            }

            catch (IOException ex)
            {
                System.out.println("Error reading file '" + fileName + "'");
            }

            System.out.println("The cost (Merge Sort) of sorting " + fileNumber + " numbers is " + cost + ".\n");
            fileNumber = fileNumber * 2;
        }


    }
}