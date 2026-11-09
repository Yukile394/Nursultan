package minecraft;

import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class class04326<T> {
   private final class04319 N;
   private final List<Pair<T, class04319>> y;
   private final Duration L;

   public long L() {
      return this.N.y();
   }

   public class04326(Duration var1, List<Pair<T, class04319>> var2) {
      super();
      this.L = var1;
      this.N = var2.stream().<class04319>map(Pair::getSecond).reduce(new class04319(0L, 0L), class04319::N);
      this.y = var2.stream().sorted(Comparator.comparing(Pair::getSecond, class04319.L)).limit(10L).toList();
   }

   public List<Pair<T, class04319>> i() {
      return this.y;
   }

   public long u() {
      return this.N.L();
   }

   public double y() {
      return (double)this.N.L() / this.L.getSeconds();
   }

   public double N() {
      return (double)this.N.y() / this.L.getSeconds();
   }
}
