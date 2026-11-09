package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class class07741 extends AbstractList<class07709> implements class07023 {
   private static final String y = "";
   private static final int L = 36;
   public static final class01424<class07741> N = new class07724();
   private final List<class07709> t;

   @Override
   public byte L() {
      return 9;
   }

   public class07709 set(int var1, class07709 var2) {
      return this.t.set(var1, var2);
   }

   @Override
   public class07709 get(int var1) {
      return this.t.get(var1);
   }

   public class07741 N() {
      ArrayList arraylist = new ArrayList(this.t.size());

      for (class07709 class07709 : this.t) {
         arraylist.add(class07709.N());
      }

      return new class07741(arraylist);
   }

   public Optional<Short> M(int var1) {
      return this.P(var1).flatMap(class07709::T);
   }

   private Optional<class07709> P(int var1) {
      return Optional.ofNullable(this.m(var1));
   }

   class07741(List<class07709> var1) {
      super();
      this.t = var1;
   }

   public class07741() {
      this(new ArrayList<>());
   }

   @Override
   public int size() {
      return this.t.size();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class07741 && Objects.equals(this.t, ((class07741)var1).t);
   }

   @Override
   public String toString() {
      class04818 class04818 = new class04818();
      class04818.N(this);
      return class04818.N();
   }

   @Override
   public int hashCode() {
      return this.t.hashCode();
   }

   public Optional<Integer> B(int var1) {
      return this.P(var1).flatMap(class07709::b);
   }

   public Optional<int[]> Z(int var1) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class06995 ? Optional.of(((class06995)class07709).M()) : Optional.empty();
   }

   @Override
   public void clear() {
      this.t.clear();
   }

   @Override
   public boolean isEmpty() {
      return this.t.isEmpty();
   }

   @Override
   public Stream<class07709> stream() {
      return super.stream();
   }

   byte i() {
      byte b0 = 0;
      Iterator<class07709> iterator = this.t.iterator();

      while (iterator.hasNext()) {
         byte b1 = iterator.next().L();
         if (b0 == 0) {
            b0 = b1;
         } else if (b0 != b1) {
            return 10;
         }
      }

      return b0;
   }

   public Optional<class07741> i(int var1) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class07741 ? Optional.of((class07741)class07709) : Optional.empty();
   }

   @Nullable
   private class07709 m(int var1) {
      return var1 >= 0 && var1 < this.t.size() ? this.t.get(var1) : null;
   }

   public Optional<Double> U(int var1) {
      return this.P(var1).flatMap(class07709::n);
   }

   public Stream<class07001> z() {
      return this.stream().mapMulti((var0, var1) -> {
         if (var0 instanceof class07001 class07001) {
            var1.accept(class07001);
         }
      });
   }

   public Optional<long[]> z(int var1) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class07757 ? Optional.of(((class07757)class07709).M()) : Optional.empty();
   }

   @Override
   public class01424<class07741> u() {
      return N;
   }

   public void add(int var1, class07709 var2) {
      this.t.add(var1, var2);
   }

   @Override
   public class07709 remove(int var1) {
      return this.t.remove(var1);
   }

   @Override
   public boolean y(int var1, class07709 var2) {
      this.t.add(var1, var2);
      return true;
   }

   private static boolean y(class07001 var0) {
      return var0.Z() == 1 && var0.y("");
   }

   public class07001 y(int var1) {
      return this.N(var1).orElseGet(class07001::new);
   }

   @Override
   public int y() {
      int i = 36;
      i += 4 * this.t.size();

      for (class07709 class07709 : this.t) {
         i += class07709.y();
      }

      return i;
   }

   private static class07001 y(class07709 var0) {
      return new class07001(Map.of("", var0));
   }

   public Optional<Float> E(int var1) {
      return this.P(var1).flatMap(class07709::v);
   }

   public Optional<class07001> N(int var1) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class07001 ? Optional.of((class07001)class07709) : Optional.empty();
   }

   public String N(int var1, String var2) {
      if (this.m(var1) instanceof class07707 class07707x) {
         class07707 class07707x = class07707x;

         try {
            return class07707x.U();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }
      } else {
         return var2;
      }
   }

   @Override
   public class03154 N(class03175 var1) {
      byte b0 = this.i();
      switch (var1.N(class01465.N(b0), this.t.size())) {
         case field_36255:
            return class03154.field_36255;
         case field_36254:
            return var1.y();
         default:
            int i = 0;

            while (i < this.t.size()) {
               class07709 class07709 = N(b0, this.t.get(i));
               switch (var1.y(class07709.u(), i)) {
                  case field_36251:
                     return class03154.field_36255;
                  case field_36250:
                     return var1.y();
                  default:
                     switch (class07709.N(var1)) {
                        case field_36255:
                           return class03154.field_36255;
                        case field_36254:
                           return var1.y();
                     }
                  case field_36249:
                     i++;
               }
            }

            return var1.y();
      }
   }

   public short N(int var1, short var2) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class07737 ? ((class07737)class07709).Z() : var2;
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   private static class07709 N(byte var0, class07709 var1) {
      if (var0 != 10) {
         return var1;
      } else {
         return var1 instanceof class07001 class07001 && !y(class07001) ? class07001 : y(var1);
      }
   }

   public void N(class07709 var1) {
      if (var1 instanceof class07001 class07001) {
         this.add(N(class07001));
      } else {
         this.add(var1);
      }
   }

   private static class07709 N(class07001 var0) {
      if (var0.Z() == 1) {
         class07709 class07709 = var0.N("");
         if (class07709 != null) {
            return class07709;
         }
      }

      return var0;
   }

   @Override
   public boolean N(int var1, class07709 var2) {
      this.t.set(var1, var2);
      return true;
   }

   public float N(int var1, float var2) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class07737 ? ((class07737)class07709).E() : var2;
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      byte b0 = this.i();
      var1.writeByte(b0);
      var1.writeInt(this.t.size());

      for (class07709 class07709 : this.t) {
         N(b0, class07709).N(var1);
      }
   }

   public int N(int var1, int var2) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class07737 ? ((class07737)class07709).B() : var2;
   }

   public double N(int var1, double var2) {
      class07709 class07709 = this.m(var1);
      return class07709 instanceof class07737 ? ((class07737)class07709).U() : var2;
   }

   public Optional<String> W(int var1) {
      return this.P(var1).flatMap(class07709::ah_);
   }

   public class07741 R(int var1) {
      return this.i(var1).orElseGet(class07741::new);
   }

   @Override
   public Optional<class07741> al_() {
      return Optional.of(this);
   }
}
