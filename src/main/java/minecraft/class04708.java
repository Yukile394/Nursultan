package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04708 extends class05407 {
   private static final Logger y = LogUtils.getLogger();
   private static final class05423 L = new class05423(Duration.ofSeconds(5L));
   private final List<class05129> u;
   private final class05096 i;
   protected final class01885 N = class01885.u();
   private volatile class00392 R;
   @Nullable
   private class01860 M;

   public class04708(class05096 var1, class05129... var2) {
      super(class05153.N);
      this.i = var1;
      this.u = List.of(var2);
      if (this.u.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.R = this.u.get(0).N();
         Runnable runnable = () -> {
            for (class05129 class05129 : var2) {
               this.N(class05129.N());
               if (class05129.y()) {
                  break;
               }

               class05129.run();
               if (class05129.y()) {
                  return;
               }
            }
         };
         Thread thread = new Thread(runnable, "Realms-long-running-task");
         thread.setUncaughtExceptionHandler(new class05103(y));
         thread.start();
      }
   }

   protected void N() {
      Iterator<class05129> iterator = this.u.iterator();

      while (iterator.hasNext()) {
         iterator.next().i();
      }

      this.field_22787.N(this.i);
   }

   public void N(class00392 var1) {
      if (this.M != null) {
         this.M.method_25355(var1);
      }

      this.R = var1;
   }

   @Override
   public void method_25426() {
      this.N.L().y();
      this.N.N(U());
      this.M = new class01860(this.field_22793, this.R);
      this.N.N(this.M, var0 -> var0.L(10).i(30));
      this.N.N(class05362.method_46430(class05220.i, var1 -> this.N()).N());
      this.N.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.v() == 256) {
         this.N();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_48640() {
      this.N.N();
      class02077.N(this.N, this.method_48202());
   }

   @Override
   public void method_25393() {
      super.method_25393();
      if (this.M != null) {
         L.N(this.field_22787.NT(), this.M.method_25369());
      }
   }

   @Override
   public boolean method_73339() {
      return false;
   }
}
