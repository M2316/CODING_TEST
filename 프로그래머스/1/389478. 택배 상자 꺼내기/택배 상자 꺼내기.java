class Solution {
    public int solution(int n, int w, int num) {
    int answer = 0;
    int h = (n / w) + 1; // 높이
    int x = 1; // 상자 번호
    int[][] storage = new int[h][w]; // 창고 배열

    // 창고 배치
    for (int i = 0; i < h; i++) {
        int[] t = new int[w];
        for (int j = 0; j < w; j++) {
            if (x <= n) { // n 이하의 상자만 채움
                t[j] = x++;
            } else { // n보다 크면 빈 공간(0)
                t[j] = 0;
            }
        }
        if (i % 2 == 1) { // 역방향 라인(홀수 번째 줄)
            reverseArray(t);
        }
        storage[i] = t;
    }

    // 상자 찾고 개수 세기
    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            if (storage[i][j] == num) {
                int d = i;
                while (d < h && storage[d][j] != 0) { // 꺼낼 박스가 있으면
                    answer++;
                    d++; // 아래로 내려감
                }
                return answer; // num을 찾으면 더 이상 탐색할 필요 없음
            }
        }
    }
    
    return answer; // num이 존재하지 않는 경우 (이론적으로는 없음)
}

// 배열을 뒤집는 함수
private void reverseArray(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
}