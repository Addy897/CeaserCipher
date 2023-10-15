class Ceaser{
    void Usage(){
        System.out.println("[-] -e [MSG] for encode\n-d [Cipher] for decode");
    }
    private int SHIFT=1;
    Ceaser(int x){
        SHIFT=x;
    }
    
    void encode(String msg){
        String en="";
        for(int i=0;i<msg.length();i++){
            en+=(char)((int)msg.charAt(i)+SHIFT);
        }
        System.out.println(en);
    }

    void decode(String cip){
        String msg="";
        for(int i=0;i<cip.length();i++){
            msg+=(char)((int)cip.charAt(i)-SHIFT);
        }
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Ceaser ceaser=new Ceaser(4);
        if(args.length<2){
            ceaser.Usage();
            return;
        }
        if(args[0].compareTo("-e")==0){
            ceaser.encode(args[1]);
        }
        if(args[0].compareTo("-d")==0){
            ceaser.decode(args[1]);
        }

    }
}