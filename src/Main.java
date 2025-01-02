public class Main {
    public static void main(String[] args) {
        String [] words = {"هيا هيا قفو من جديد","هيا قولو النصر نريد","بددوا غيوم التشاؤم","شدوا اواصر التلاحم","امسحوا دموع الخسارة فالنصر لصاحب الجدارة","لنحيل اليأس طموح والتردد غير مسموح","فالشدة تصنع الأبطاااااااااااااااااال","مع العزم لامحال","♪♫♪♫♫♬♩♪♬♩♩♬♩♪♫♪♫♫♬♩♪♬♩♩♬♩","♪♫♪♫♫♬♩♪♬♩♩♬♩♪♫♪♫♫♬♩♪♬♩♩♬♩","♪♫♪♫♫♬♩♪♬♩♩♬♩♪♫♪♫♫♬♩♪♬♩♩♬♩"};
        for(String word : words){
            for(int index = 0; index < word.length(); index++){
                System.out.print(word.charAt(index));
                try {
                    Thread.sleep(110);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        }

    }
}
