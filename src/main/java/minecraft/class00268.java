package minecraft;

public record class00268(class00295 contents, byte flags) {
   public static final byte N = 1;
   public static final byte y = 2;
   public static final class02362<class04247, class00268> L = class02362.N(class00295.N, class00268::L, class02389.L, class00268::u, class00268::new);

   public class00295 L() {
      return this.contents;
   }

   public class00268(class00295 var1, boolean var2, boolean var3) {
      this(var1, (byte)((var2 ? 1 : 0) | (var3 ? 2 : 0)));
   }

   public class00268(class00295 contents, byte flags) {
      super();
      this.contents = contents;
      this.flags = flags;
   }

   public byte u() {
      return this.flags;
   }

   public boolean y() {
      return (this.flags & 2) != 0;
   }

   public boolean N() {
      return (this.flags & 1) != 0;
   }
}
