package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;

public record class02539(List<class02548> effects) implements class02548 {
   public static final MapCodec<class02539> N = class02556.N(class02548.L, class02539::new, class02539::y);

   public class02539(List<class02548> effects) {
      this.effects = effects;
   }

   public List<class02548> y() {
      return this.effects;
   }

   @Override
   public void N(class02525 var1, class07049 var2, class06889 var3, int var4) {
      Iterator<class02548> iterator = this.effects.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1, var2, var3, var4);
      }
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5, boolean var6) {
      Iterator<class02548> iterator = this.effects.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public MapCodec<class02539> N() {
      return N;
   }
}
