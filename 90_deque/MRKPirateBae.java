public class MRKPirateBae{
  public static void main(String[] args) {
      LLDeque test = new LLDeque();
      test.addLast( "first" );
      test.addLast( "second" );
      test.addLast( "third" );
      test.addLast( "fourth" );
      test.addLast( "fifth" );
      test.addLast( "sixth" );

      System.out.println("Peek first: " + test.peekFirst());
      System.out.println("Peek last: " + test.peekLast());
      System.out.println("Removing last: " + test.removeLast());
      System.out.println("Removing first: " + test.removeFirst());

      System.out.println("Peek first: " + test.peekFirst());

      System.out.println("Peek last: " + test.peekLast());

      test.addFirst("surprise");
      System.out.println("Peek first: " + test.peekFirst());

      System.out.println("Polling first: " + test.pollFirst());
      System.out.println("Polling last: " + test.pollLast());

      System.out.println("Get first: " + test.getFirst());
      System.out.println("Get last: " + test.getLast());

      System.out.println("Size: " + test.size());

      System.out.println("Is there surprise? " + test.contains("surprise"));
      System.out.println("Is there volcano? " + test.contains("volcano"));
    }
}
