package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class00320 extends class00891 implements class00873 {
   public static final MapCodec<class00320> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05946.N(class04227.Nh).fieldOf("feature").forGetter(var0x -> var0x.y), t()).apply(var0, class00320::new)
   );
   private final class05946<class03238<?, ?>> y;

   public class00320(class05946<class03238<?, ?>> var1, class01362 var2) {
      super(var2);
      this.y = var1;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10084()).P();
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      var1.method_30349()
         .method_46759(class04227.Nh)
         .flatMap(var1x -> var1x.N(this.y))
         .ifPresent(var3x -> var3x.N().N(var1, var1.method_14178().U(), var2, var3.method_10084()));
   }

   @Override
   public MapCodec<class00320> N() {
      return N;
   }

   @Override
   public class00901 ay_() {
      return class00901.field_47834;
   }
}
