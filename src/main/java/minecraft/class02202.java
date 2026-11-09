package minecraft;

import com.mojang.serialization.MapCodec;

public class class02202 extends class00891 implements class00873 {
   public static final MapCodec<class02202> N = y(class02202::new);

   public class02202(class01362 var1) {
      super(var1);
   }

   @Override
   public class07209 N(class07209 var1) {
      return var1.method_10074();
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      var1.method_8501(var3.method_10074(), class00869.nR.W());
   }

   @Override
   public MapCodec<class02202> N() {
      return N;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10074()).P();
   }
}
