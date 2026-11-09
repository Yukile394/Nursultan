package minecraft;

import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

public class class03365 {
   private final class08233 Z = new class08233();
   private final Queue<Runnable> z = Queues.newConcurrentLinkedQueue();
   final Executor N = this.z::add;
   final Queue<class08744> y = Queues.newConcurrentLinkedQueue();
   final class03950 L;
   private final class03130 U;
   volatile boolean u;
   private final class08214 E;
   private final class08717 W;
   class03448 i;
   final class03063 R;
   class06889 M = class06889.L;
   final class02614 B;

   public boolean L() {
      return this.Z.N() == 0 && this.z.isEmpty();
   }

   public int M() {
      return this.z.size();
   }

   public class03365(class03448 var1, class03063 var2, class08717 var3, class01386 var4, class01999 var5, class03579 var6) {
      super();
      this.i = var1;
      this.R = var2;
      this.L = var4.N();
      this.U = var4.y();
      this.W = var3;
      this.E = new class08214(var3, "Section Renderer");
      this.E.N(this::Z);
      this.B = new class02614(var5, var6);
   }

   public int B() {
      return this.U.method_54646();
   }

   private void Z() {
      if (!this.u && !this.U.method_54645()) {
         class03354 class03354 = this.Z.N(this.M);
         if (class03354 != null) {
            class03950 class03950 = Objects.requireNonNull(this.U.method_54642());
            CompletableFuture.<CompletableFuture<class03335>>supplyAsync(() -> class03354.N(class03950), this.W.N(class03354.y()))
               .thenCompose(var0 -> (CompletionStage<class03335>)var0)
               .whenComplete((var3, var4) -> {
                  if (var4 != null) {
                     class06202.Nq().u(class07080.N(var4, "Batching sections"));
                  } else {
                     class03354.y.set(true);
                     this.E.N(() -> {
                        if (var3 == class03335.field_21438) {
                           class03950.N();
                        } else {
                           class03950.y();
                        }

                        this.U.method_54644(class03950);
                        this.Z();
                     });
                  }
               });
         }
      }
   }

   public String i() {
      return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.Z.N(), this.z.size(), this.U.method_54646());
   }

   public void u() {
      this.u = true;
      this.y();
      this.N();
   }

   public void y() {
      this.Z.y();
   }

   public void N(class03448 var1) {
      this.i = var1;
   }

   public void N(class03354 var1) {
      if (!this.u) {
         this.E.N(() -> {
            if (!this.u) {
               this.Z.N(var1);
               this.Z();
            }
         });
      }
   }

   public void N(class03345 var1, class03176 var2) {
      var1.L(var2);
   }

   public void N() {
      Runnable runnable;
      while ((runnable = this.z.poll()) != null) {
         runnable.run();
      }

      class08744 class08744;
      while ((class08744 = this.y.poll()) != null) {
         class08744.close();
      }
   }

   public void N(class06889 var1) {
      this.M = var1;
   }

   public int R() {
      return this.Z.N();
   }
}
