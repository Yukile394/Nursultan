package minecraft;

import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02541(class01894 id, class03556<class07468> attribute, class02546 amount, class07463 operation) implements class02548 {
   public static final MapCodec<class02541> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01894.N.fieldOf("id").forGetter(class02541::y),
            class07468.N.fieldOf("attribute").forGetter(class02541::L),
            class02546.y.fieldOf("amount").forGetter(class02541::u),
            class07463.field_45742.fieldOf("operation").forGetter(class02541::i)
         )
         .apply(var0, class02541::new)
   );

   public class03556<class07468> L() {
      return this.attribute;
   }

   public class02541(class01894 id, class03556<class07468> attribute, class02546 amount, class07463 operation) {
      this.id = id;
      this.attribute = attribute;
      this.amount = amount;
      this.operation = operation;
   }

   public class07463 i() {
      return this.operation;
   }

   public class02546 u() {
      return this.amount;
   }

   public class01894 y() {
      return this.id;
   }

   private class01894 N(class05033 var1) {
      return this.id.M("/" + var1.method_15434());
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5, boolean var6) {
      if (var6 && var4 instanceof class07438) {
         ((class07438)var4).method_6127().N(this.N(var2, var3.y()));
      }
   }

   @Override
   public MapCodec<class02541> N() {
      return N;
   }

   private HashMultimap<class03556<class07468>, class07471> N(int var1, class07085 var2) {
      HashMultimap hashmultimap = HashMultimap.create();
      hashmultimap.put(this.attribute, this.N(var1, (class05033)var2));
      return hashmultimap;
   }

   public class07471 N(int var1, class05033 var2) {
      return new class07471(this.N(var2), this.u().N(var1), this.i());
   }

   @Override
   public void N(class02525 var1, class07049 var2, class06889 var3, int var4) {
      if (var2 instanceof class07438) {
         ((class07438)var2).method_6127().y(this.N(var4, var1.y()));
      }
   }
}
