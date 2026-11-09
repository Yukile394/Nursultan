package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08933() implements class08909 {
   public static final MapCodec<class08933> N = MapCodec.unit(new class08933());

   public class08933() {
      super();
   }

   @Override
   public MapCodec<class08933> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var3 instanceof class04453 && ((class07482)((class04453)var3).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M() == var1;
   }
}
