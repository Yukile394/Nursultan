package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08935() implements class08909 {
   public static final MapCodec<class08935> N = MapCodec.unit(new class08935());

   public class08935() {
   }

   @Override
   public MapCodec<class08935> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var3 instanceof class04453 && ((class04453)var3).method_31548().y() == var1;
   }
}
