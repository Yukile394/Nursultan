package minecraft;

public record class03126(byte flags) {
   public static final class03126 N = new class03126((byte)0);
   private static final byte L = 1;
   private static final byte u = 2;

   public boolean L() {
      return (this.flags & 2) != 0;
   }

   public class03126(byte flags) {
      this.flags = flags;
   }

   public byte i() {
      return this.flags;
   }

   public class03126 u() {
      return this.N((byte)2);
   }

   public class03126 y() {
      return this.N((byte)1);
   }

   public boolean N() {
      return (this.flags & 1) != 0;
   }

   private class03126 N(byte var1) {
      int i = this.flags | var1;
      return i != this.flags ? new class03126((byte)i) : this;
   }
}
