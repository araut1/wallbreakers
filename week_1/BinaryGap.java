class Solution {
   public int binaryGap(int N) {

	int distance = 0, last = -1;
  
  
	for (int i = 0; i < 31 && N != 0; ++i, N >>>= 1) {
		if ((N & 1) == 1) {
			distance = Math.max(distance, last != -1 ? i - last : 0);
			last = i;
		}
	}
	return distance;
}
}
