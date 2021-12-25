class e05_02{
    private char first,second;
    e05_02(){
        first='A';
        second='Z';
    }
    public String getcharacter()
    {
        String answer="";
        for(int i=0;i<=(int)second-(int)first;i++)
        answer+=(char)(first+i)+" ";
        return answer;
    }
}

class example05_02{
    public static void main(String args[])
    {
        e05_02 test=new e05_02();
        System.out.print(test.getcharacter());
    }
}