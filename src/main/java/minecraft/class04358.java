package minecraft;

import Nursultan.class10340;
import Nursultan.class10343;
import Nursultan.class10344;
import Nursultan.class10345;
import Nursultan.class10346;
import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04358 implements class04376 {
   private static final Logger y = LogUtils.getLogger();
   private final class07299 L;
   private final int u;
   private final ArrayDeque<class10340> i = new ArrayDeque<>();
   private final List<class10340> R = new ArrayList<>();
   private int M = 0;
   @Nullable
   private Consumer<class07209> B;

   public class04358(class07299 var1, int var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Override
   public void N(class07209 var1, class00891 var2, @Nullable class07211 var3, @Nullable class02733 var4) {
      this.N(var1, new class10343(var1.method_10062(), var2, var4, var3));
   }

   private void N(class07209 var1, class10340 var2) {
      boolean flag = this.M > 0;
      boolean flag1 = this.u >= 0 && this.M >= this.u;
      this.M++;
      if (!flag1) {
         if (flag) {
            this.R.add(var2);
         } else {
            this.i.push(var2);
         }
      } else if (this.M - 1 == this.u) {
         y.error("Too many chained neighbor updates. Skipping the rest. First skipped position: {}", var1.method_23854());
      }

      if (!flag) {
         this.N();
      }
   }

   private void N() {
      try {
         while (!this.i.isEmpty() || !this.R.isEmpty()) {
            for (int ix = this.R.size() - 1; ix >= 0; ix--) {
               this.i.push(this.R.get(ix));
            }

            this.R.clear();
            class10340 class10340 = this.i.peek();
            if (this.B != null) {
               class10340.N(this.B);
            }

            while (this.R.isEmpty()) {
               if (!class10340.N(this.L)) {
                  this.i.pop();
                  break;
               }
            }
         }
      } finally {
         this.i.clear();
         this.R.clear();
         this.M = 0;
      }
   }

   @Override
   public void N(class00500 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5) {
      this.N(var2, new class10346(var1, var2.method_10062(), var3, var4, var5));
   }

   public void N(@Nullable Consumer<class07209> var1) {
      this.B = var1;
   }

   @Override
   public void N(class07209 var1, class00891 var2, @Nullable class02733 var3) {
      this.N(var1, new class10344(var1, var2, var3));
   }

   @Override
   public void N(class07211 var1, class00500 var2, class07209 var3, class07209 var4, int var5, int var6) {
      this.N(var3, new class10345(var1, var2, var3.method_10062(), var4.method_10062(), var5, var6));
   }
}
