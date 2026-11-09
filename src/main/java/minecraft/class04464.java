package minecraft;

import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class04464(
   int globalIndex, UUID sender, int index, class04469 signature, class03056 body, class00392 unsignedContent, class03055 filterMask, class00649 chatType
) implements class00381<class07280> {
   public static final class02362<class04247, class04464> N = class00381.N(class04464::N, class04464::new);

   public int L() {
      return this.index;
   }

   public class03056 M() {
      return this.body;
   }

   private class04464(class04247 var1) {
      this(
         var1.E(),
         var1.m(),
         var1.E(),
         var1.L(class04469::N),
         new class03056(var1),
         class00667.N(var1, class03748.u),
         class03055.N(var1),
         class00649.N.decode(var1)
      );
   }

   public class04464(
      int globalIndex,
      UUID sender,
      int index,
      @Nullable class04469 signature,
      class03056 body,
      @Nullable class00392 unsignedContent,
      class03055 filterMask,
      class00649 chatType
   ) {
      super();
      this.globalIndex = globalIndex;
      this.sender = sender;
      this.index = index;
      this.signature = signature;
      this.body = body;
      this.unsignedContent = unsignedContent;
      this.filterMask = filterMask;
      this.chatType = chatType;
   }

   @Nullable
   public class00392 B() {
      return this.unsignedContent;
   }

   public class03055 Z() {
      return this.filterMask;
   }

   @Override
   public boolean i() {
      return true;
   }

   public class00649 z() {
      return this.chatType;
   }

   @Nullable
   public class04469 u() {
      return this.signature;
   }

   public UUID y() {
      return this.sender;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.globalIndex;
   }

   private void N(class04247 var1) {
      var1.L(this.globalIndex);
      var1.N(this.sender);
      var1.L(this.index);
      var1.N(this.signature, class04469::N);
      this.body.N(var1);
      class00667.N(var1, this.unsignedContent, class03748.u);
      class03055.N(var1, this.filterMask);
      class00649.N.encode(var1, this.chatType);
   }

   @Override
   public class02897<class04464> method_65080() {
      return class04248.NM;
   }
}
