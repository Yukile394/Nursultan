package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class00200 extends class00201 {
   public static final MapCodec<class00200> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00195.N.forGetter(class00201::m)).apply(var0, class00200::new)
   );

   public class00200(class00195<class03556<class00225>> var1) {
      super(var1);
   }

   @Override
   protected class05216 y() {
      return class00392.L("test_instance.type.block_based");
   }

   private class07209 y(class05523 var1) {
      List<class07209> list = this.N(var1, class00235.field_56024);
      if (list.isEmpty()) {
         var1.y(class00392.N("test_block.error.missing", class00235.field_56024.N()));
      }

      if (list.size() != 1) {
         var1.y(class00392.N("test_block.error.too_many", class00235.field_56024.N()));
      }

      return list.getFirst();
   }

   @Override
   public void N(class05523 var1) {
      class07209 class07209 = this.y(var1);
      var1.N(class07209, class08594.class).R();
      var1.i(() -> {
         List<class07209> list = this.N(var1, class00235.field_56027);
         if (list.isEmpty()) {
            var1.y(class00392.N("test_block.error.missing", class00235.field_56027.N()));
         }

         if (list.stream().map(var1xx -> var1.N(var1xx, class08594.class)).anyMatch(class08594::B)) {
            var1.u();
         } else {
            this.N(var1, class00235.field_56026, var1xx -> var1.y(class00392.y(var1xx.Z())));
            this.N(var1, class00235.field_56025, class08594::R);
         }
      });
   }

   @Override
   public MapCodec<class00200> N() {
      return N;
   }

   private void N(class05523 var1, class00235 var2, Consumer<class08594> var3) {
      for (class07209 class07209 : this.N(var1, var2)) {
         class08594 class08594 = var1.N(class07209, class08594.class);
         if (class08594.B()) {
            var3.accept(class08594);
            class08594.u();
         }
      }
   }

   private List<class07209> N(class05523 var1, class00235 var2) {
      ArrayList arraylist = new ArrayList();
      var1.N(var3x -> {
         class00500 class00500 = var1.N(var3x);
         if (class00500.N(class00869.TN) && class00500.L(class08620.y) == var2) {
            arraylist.add(var3x.method_10062());
         }
      });
      return arraylist;
   }
}
