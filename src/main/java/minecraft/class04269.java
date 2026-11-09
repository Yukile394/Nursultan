package minecraft;

import org.jspecify.annotations.Nullable;

public record class04269(class01894 key, byte[] payload) implements class00381<class04245> {
   public static final class02362<class00667, class04269> N = class00381.N(class04269::N, class04269::new);

   private class04269(class00667 var1) {
      this(var1.T(), var1.L(class02872.y));
   }

   public class04269(class01894 key, @Nullable byte[] payload) {
      this.key = key;
      this.payload = payload;
   }

   @Nullable
   public byte[] y() {
      return this.payload;
   }

   private void N(class00667 var1) {
      var1.N(this.key);
      var1.N(this.payload, class02872.y);
   }

   public class01894 N() {
      return this.key;
   }

   public void method_65081(class04245 var1) {
      var1.method_55851(this);
   }

   @Override
   public class02897<class04269> method_65080() {
      return class04261.y;
   }
}
