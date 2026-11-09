package minecraft;

import Nursultan.class10419;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class class06813 implements class06834 {
   protected final class06834 y;

   public class06813(class06834 var1) {
      super();
      this.y = var1;
   }

   @Override
   public final class06838 N(class05908 var1) {
      return this.N(this.y.N(var1));
   }

   @Override
   public void N(class05561 var1) {
      class06834.super.N(var1);
      this.y.N(var1.N(new class10419("slot_source")));
   }

   protected abstract class06838 N(class06838 var1);

   protected static <T extends class06813> P1<Mu<T>, class06834> N(Instance<T> var0) {
      return var0.group(class06848.y.fieldOf("slot_source").forGetter(var0x -> var0x.y));
   }

   @Override
   public abstract MapCodec<? extends class06813> N();
}
