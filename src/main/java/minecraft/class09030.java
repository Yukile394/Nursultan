package minecraft;

import io.netty.buffer.ByteBuf;

public record class09030(class03556<class09037> dialog) implements class00381<class01662> {
   public static final class02362<class04247, class09030> N = class02362.N(class09037.R, class09030::N, class09030::new);
   public static final class02362<ByteBuf, class09030> y = class02362.N(class09037.M.N_10(class03556::N, class03556::N), class09030::N, class09030::new);

   public class09030(class03556<class09037> dialog) {
      super();
      this.dialog = dialog;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   public class03556<class09037> N() {
      return this.dialog;
   }

   @Override
   public class02897<class09030> method_65080() {
      return class02885.z;
   }
}
