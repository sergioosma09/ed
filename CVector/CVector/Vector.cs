using System;

namespace CVector
{
	public class Vector
	{
		public static void Sort (int[] v){
//			int n = v.Length;
//			for (int positionIndex = 0; positionIndex < n - 1; positionIndex++) {
//				int indexMin = positionIndex;
//				for (int index = indexMin + 1; index < n; index++) 
//					if (v [index] < v [indexMin])
//						indexMin = index;
//					int aux = v [positionIndex];
//					v [positionIndex] = v [indexMin];
//					v [indexMin] = aux;
//				
//			}
			int n = v.Length;
			for (int positionIndex = 0; positionIndex < n - 1; positionIndex++) {
				int indexMin = indexMin(v,positionIndex);
				Swap (v, positionIndex, indexMin);
			}
//			for (int positionIndex = 0; positionIndex < n - 1; positionIndex++) {
//				Swap (v,positionIndex,indexMin,positionIndex);
		}


		/// <summary>
		/// Indexs the minimum.
		/// </summary>
		/// <returns>The minimum.</returns>
		/// <param name="v">V.</param>
		/// <param name="initialIndex">Initial index.</param>
		public static int IndexMin(int[] v, int initialIndex){
			if(initialIndex>=v.index)
				throw new IndexOutOfRangeException();
			int indexMin = initialIndex;
			for(int index =initialIndex+1;index<v.Length;index++)
				if(v[index]<v[initialIndex])
					indexMin=indexer;
					return indexMin;
		}
		public static void Swap(int[] v, int index, int otherIndex){
			int aux = v [index];
			v [index] = v [otherIndex];
			v [otherIndex] = aux;

		}
	}
}