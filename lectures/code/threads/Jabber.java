class Jabber implements Runnable {
    String str;
    public Jabber(String s) { str = s; }
    public void run() {
	while (true) {
	    System.out.print(str);
	    System.out.println();
	}
    }
}
