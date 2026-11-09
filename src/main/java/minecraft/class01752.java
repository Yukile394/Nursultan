package minecraft;

import Nursultan.class09516;
import com.google.common.collect.Queues;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Deque;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01752<T> implements AutoCloseable {
   private static final int N = 10000000;
   private static final Logger y = LogUtils.getLogger();
   private final int L;
   private final int u;
   private final class04643 i;
   @Nullable
   private class01704 R;
   private int M;
   private boolean B;
   private final Deque<class01714<T>> Z = Queues.newArrayDeque();
   private final List<class01714<T>> z = new ObjectArrayList();
   private int U;

   public class04643 L() {
      return this.i;
   }

   private void M() {
      for (int ix = this.z.size() - 1; ix >= 0; ix--) {
         this.Z.addFirst(this.z.get(ix));
      }

      this.z.clear();
   }

   public class01752(int var1, int var2, class04643 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.M = var1;
   }

   public void i() {
      this.M--;
   }

   @Override
   public void close() {
      if (this.R != null) {
         this.R.close();
      }
   }

   public int u() {
      return this.u;
   }

   @Nullable
   public class01704 y() {
      return this.R;
   }

   public class03115 y(int var1) {
      return () -> this.N(var1);
   }

   public static <T extends class01711<T>> void N(class01752<T> var0, String var1, ContextChain<T> var2, T var3, class03102 var4) {
      var0.N(new class01714<>(N(var0, var4), new class09516<>(var1, var2, (T)var3)));
   }

   public void N(int var1) {
      while (!this.Z.isEmpty() && this.Z.peek().N().L() >= var1) {
         this.Z.removeFirst();
      }
   }

   public void N(class01714<T> var1) {
      if (this.z.size() + this.Z.size() > 10000000) {
         this.R();
      }

      if (!this.B) {
         this.z.add(var1);
      }
   }

   private static <T extends class01711<T>> class03099 N(class01752<T> var0, class03102 var1) {
      if (var0.U == 0) {
         return new class03099(0, var1, var0.Z::clear);
      } else {
         int ix = var0.U + 1;
         return new class03099(ix, var1, var0.y(ix));
      }
   }

   public void N(@Nullable class01704 var1) {
      this.R = var1;
   }

   public void N() {
      this.M();

      while (true) {
         if (this.M <= 0) {
            y.info("Command execution stopped due to limit (executed {} commands)", this.L);
            break;
         }

         class01714 class01714 = this.Z.pollFirst();
         if (class01714 == null) {
            return;
         }

         this.U = class01714.N().L();
         class01714.N(this);
         if (this.B) {
            y.error("Command execution stopped due to command queue overflow (max {})", 10000000);
            break;
         }

         this.M();
      }

      this.U = 0;
   }

   public static <T extends class01711<T>> void N(class01752<T> var0, class01747<T> var1, T var2, class03102 var3) {
      var0.N(new class01714<>(N(var0, var3), new class01724<T>(var1, var2.T(), false).N((T)var2)));
   }

   private void R() {
      this.B = true;
      this.z.clear();
      this.Z.clear();
   }
}
