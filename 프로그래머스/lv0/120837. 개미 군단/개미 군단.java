class Solution {
    public int solution(int hp) {
        int answer = 0;
        int ant = 0;
        answer = hp/5;

        hp = hp%5 ;

        answer = answer+ hp/3;

        hp = hp%3;

        answer = answer + hp;
        return answer;
    }
}