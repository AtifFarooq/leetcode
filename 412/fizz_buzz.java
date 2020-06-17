class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);
            String answerStr = "";
            
            if (divisibleBy3) {
                answerStr += "Fizz";
            }
            
            if (divisibleBy5) {
                answerStr += "Buzz";
            }
            
            if (answerStr.equals("")) {
                answerStr += Integer.toString(i);
            }
            
            // append current answer to answer list
            list.add(answerStr);
        }
        return list;
    }
}