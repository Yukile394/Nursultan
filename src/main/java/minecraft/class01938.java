package minecraft;

import java.util.Optional;

public record class01938(int entityId, class03556<class03689> sourceType, int sourceCauseId, int sourceDirectId, Optional<class06889> sourcePosition)
   implements class00381<class07280> {
   public static final class02362<class04247, class01938> N = class00381.N(class01938::N, class01938::new);

   public int L() {
      return this.sourceCauseId;
   }

   public Optional<class06889> M() {
      return this.sourcePosition;
   }

   public class01938(class07049 var1, class07072 var2) {
      this(
         var1.method_5628(),
         var2.E(),
         var2.u() != null ? var2.u().method_5628() : -1,
         var2.L() != null ? var2.L().method_5628() : -1,
         Optional.ofNullable(var2.z())
      );
   }

   public class01938(int entityId, class03556<class03689> sourceType, int sourceCauseId, int sourceDirectId, Optional<class06889> sourcePosition) {
      this.entityId = entityId;
      this.sourceType = sourceType;
      this.sourceCauseId = sourceCauseId;
      this.sourceDirectId = sourceDirectId;
      this.sourcePosition = sourcePosition;
   }

   private class01938(class04247 var1) {
      this(
         var1.E(),
         class03689.L.decode(var1),
         N((class00667)var1),
         N((class00667)var1),
         var1.y(var0 -> new class06889(var0.readDouble(), var0.readDouble(), var0.readDouble()))
      );
   }

   public int u() {
      return this.sourceDirectId;
   }

   public class03556<class03689> y() {
      return this.sourceType;
   }

   public class07072 N(class07299 var1) {
      if (this.sourcePosition.isPresent()) {
         return new class07072(this.sourceType, this.sourcePosition.get());
      } else {
         class07049 class07049x = var1.method_8469(this.sourceCauseId);
         class07049 class07049x = var1.method_8469(this.sourceDirectId);
         return new class07072(this.sourceType, class07049x, class07049x);
      }
   }

   private static void N(class00667 var0, int var1) {
      var0.L(var1 + 1);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.entityId;
   }

   private void N(class04247 var1) {
      var1.L(this.entityId);
      class03689.L.encode(var1, this.sourceType);
      N(var1, this.sourceCauseId);
      N(var1, this.sourceDirectId);
      var1.N_13(this.sourcePosition, (var0, var1x) -> {
         var0.writeDouble(var1x.N());
         var0.writeDouble(var1x.y());
         var0.writeDouble(var1x.L());
      });
   }

   private static int N(class00667 var0) {
      return var0.E() - 1;
   }

   @Override
   public class02897<class01938> method_65080() {
      return class04248.d;
   }
}
