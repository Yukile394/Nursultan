package minecraft;

import com.google.common.base.MoreObjects;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class class06661 implements class00381<class07280> {
   public static final class02362<class04247, class06661> N = class00381.N(class06661::N, class06661::new);
   private final EnumSet<class06680> y;
   private final List<class06669> L;

   public List<class06669> L() {
      return this.y.contains(class06680.field_29136) ? this.L : List.of();
   }

   private class06661(class04247 var1) {
      super();
      this.y = var1.N(class06680.class);
      this.L = var1.N_16(var1x -> {
         class06641 class06641 = new class06641(var1x.m());
         Iterator<class06680> iterator = this.y.iterator();

         while (iterator.hasNext()) {
            iterator.next().field_40701.read(class06641, (class04247)var1x);
         }

         return class06641.N();
      });
   }

   public class06661(EnumSet<class06680> var1, Collection<class04770> var2) {
      super();
      this.y = var1;
      this.L = var2.stream().map(class06669::new).toList();
   }

   public class06661(class06680 var1, class04770 var2) {
      super();
      this.y = EnumSet.of(var1);
      this.L = List.of(new class06669(var2));
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.y).add("entries", this.L).toString();
   }

   public List<class06669> y() {
      return this.L;
   }

   public EnumSet<class06680> N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class04247 var1) {
      var1.N(this.y, class06680.class);
      var1.N_12(this.L, (var1x, var2) -> {
         var1x.N(var2.N());
         Iterator<class06680> iterator = this.y.iterator();

         while (iterator.hasNext()) {
            iterator.next().field_40702.write((class04247)var1x, var2);
         }
      });
   }

   public static class06661 N(Collection<class04770> var0) {
      EnumSet enumset = EnumSet.of(
         class06680.field_29136,
         class06680.field_40699,
         class06680.field_29137,
         class06680.field_40700,
         class06680.field_29138,
         class06680.field_29139,
         class06680.field_54981,
         class06680.field_52324
      );
      return new class06661(enumset, var0);
   }

   @Override
   public class02897<class06661> method_65080() {
      return class04248.NE;
   }
}
