package minecraft;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class class03400 {
   public final class03377 N = new class03377(class07536.Z(), TimeUnit.MILLISECONDS, class07536.u);
   private final List<class03416<?>> Z;
   public final class03416<List<class03576>> y;
   public final class03416<class03379> L;
   public final class03416<Integer> u;
   public final class03416<Boolean> i;
   public final class03416<class04979> R;
   public final class03416<class04966> M;
   public final class03398 B = new class03398(new class04714());

   public class03400(class05111 var1) {
      super();
      this.L = this.N.N("server list", () -> {
         class04967 class04967 = var1.L();
         return class05685.N() ? new class03379(class04967.N(), var1.u()) : new class03379(class04967.N(), List.of());
      }, Duration.ofSeconds(60L), class03375.N);
      this.u = this.N.N("pending invite count", var1::z, Duration.ofSeconds(10L), class03375.N(360));
      this.i = this.N.N("trial availablity", var1::m, Duration.ofSeconds(60L), class03375.N(60));
      this.R = this.N.N("unread news", var1::W, Duration.ofMinutes(5L), class03375.N);
      this.y = this.N.N("notifications", var1::i, Duration.ofMinutes(5L), class03375.N);
      this.M = this.N.N("online players", var1::M, Duration.ofSeconds(10L), class03375.N);
      this.Z = List.of(this.y, this.L, this.u, this.i, this.R, this.M);
   }

   public List<class03416<?>> N() {
      return this.Z;
   }
}
