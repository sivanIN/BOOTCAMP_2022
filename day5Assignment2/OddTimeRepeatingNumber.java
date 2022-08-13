package day5Assignment2;

import java.util.ArrayList;
import java.util.HashMap;

public class OddTimeRepeatingNumber {


	static ArrayList<Integer> OddTimeRepeatingNumbers(int arr[], int n)

	{

		HashMap<Integer,Integer> hmap = new HashMap<>();
		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i = 0; i < n; i++)

		{

			if(hmap.containsKey(arr[i]))

			{

				int val = hmap.get(arr[i]);
				hmap.put(arr[i], val + 1); 

			}

			else

				hmap.put(arr[i], 1); 
		}


		for(Integer a:hmap.keySet())

		{
			if(hmap.get(a) % 2 != 0)
				arrayList.add(a);

		}
		return arrayList;

	}


	public static void main(String[] args) 

	{

		int arr[] = new int[]{1,1,2,1, 3,2,3,4,4,3,4,4,6};

		System.out.println(OddTimeRepeatingNumbers(arr, arr.length));

	}

}
