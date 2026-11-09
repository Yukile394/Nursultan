package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.List;
import java.util.stream.Stream;

class class02130 extends MapCodec<class02108> {
   class02130(List var1) {
      super();
      this.N = var1;
   }

   public <T> DataResult<class02108> decode(DynamicOps<T> var1, MapLike<T> var2) {
      DataResult<class02104> dataresult = DataResult.success(new class02104());

      for (class02117 class02117 : this.N) {
         dataresult = this.N(dataresult, var1, var2, class02117);
      }

      return dataresult.map(class02104::N);
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return this.N.stream().map(class02117::y).map(var1::createString);
   }

   private <T, V> DataResult<class02104> N(DataResult<class02104> var1, DynamicOps<T> var2, MapLike<T> var3, class02117<V> var4) {
      Object object = var3.get(var4.y());
      if (object != null) {
         DataResult dataresult = var4.u().parse(var2, object);
         return var1.apply2stable((var1x, var2x) -> var1x.N(var4, var2x), dataresult);
      } else {
         return var1;
      }
   }

   private <T, V> RecordBuilder<T> N(class02108 var1, RecordBuilder<T> var2, class02117<V> var3) {
      Object object = var1.N(var3);
      return object != null ? var2.add(var3.y(), object, var3.u()) : var2;
   }

   public <T> RecordBuilder<T> encode(class02108 var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      RecordBuilder recordbuilder = var3;

      for (class02117 class02117 : this.N) {
         recordbuilder = this.N(var1, recordbuilder, class02117);
      }

      return recordbuilder;
   }
}
