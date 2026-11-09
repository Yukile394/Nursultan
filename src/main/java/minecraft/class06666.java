package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record class06666(UUID id, String url, String hash, boolean required, Optional<class00392> prompt) implements class00381<class01662> {
   public static final int N = 40;
   public static final class02362<ByteBuf, class06666> y = class02362.N(
      class01487.M,
      class06666::N,
      class02389.s,
      class06666::y,
      class02389.y(40),
      class06666::L,
      class02389.y,
      class06666::u,
      class03748.R.N_33(class02389::N),
      class06666::M,
      class06666::new
   );

   public String L() {
      return this.hash;
   }

   public Optional<class00392> M() {
      return this.prompt;
   }

   public class06666(UUID id, String url, String hash, boolean required, Optional<class00392> prompt) {
      super();
      if (hash.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + hash.length() + ")");
      } else {
         this.id = id;
         this.url = url;
         this.hash = hash;
         this.required = required;
         this.prompt = prompt;
      }
   }

   public boolean u() {
      return this.required;
   }

   public String y() {
      return this.url;
   }

   public UUID N() {
      return this.id;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class06666> method_65080() {
      return class02885.B;
   }
}
