package Questions;

class ThreadSafetyDemo {

    public static void main(String[] args) throws InterruptedException {
        // Create a StringBuffer and StringBuilder
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        // Create two threads to modify the StringBuffer
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                stringBuffer.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                stringBuffer.append("B");
            }
        });

        // Start the threads for StringBuffer
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        thread1.join();
        thread2.join();

        // Print the length of StringBuffer
        System.out.println("StringBuffer length: " + stringBuffer.length());
        System.out.println(stringBuffer);

        // Reset threads for StringBuilder
        thread1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                stringBuilder.append("A");
            }
        });

        thread2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                stringBuilder.append("B");
            }
        });

        // Start the threads for StringBuilder
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        thread1.join();
        thread2.join();

        // Print the length of StringBuilder
        System.out.println("StringBuilder length: " + stringBuilder.length());
        System.out.println(stringBuilder);
    }
}
