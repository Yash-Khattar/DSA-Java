public class letterproblem {
    public static void main(String[] args) {
        char[] letters = {'a', 's', 'd', 'f'};
        char target = 'c';
        nextGreatestLetter(letters, target);
    }

        public static char nextGreatestLetter(char[] letters, char target) {
            int s = letters[0];
            int e = letters[(letters.length - 1)];
            if( letters[e] < target){
                return letters[s];
            }
            while(s <= e){
                int  m = s+ (e-s)/2;
                if(target == letters[m]){
                    return letters[m+1];
                }
                else if( target < letters[m]){
                    e = m-1;
                }
                else if( target > letters[m]){
                    s = m+1;
                }
            }
            return letters[s];
        }
    }

