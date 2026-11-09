package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;

public interface class04025 extends BiPredicate<class05974, class07209> {
   Codec<class04025> y = class04206.H.T().dispatch(class04025::N, class04054::codec);
   class04025 L = N(class00869.N);
   class04025 u = N(class00869.N, class00869.K);

   static class04025 L(List<class00891> var0) {
      return N(class00753.field_11176, var0);
   }

   static class04025 L() {
      return y(class00753.field_11176);
   }

   static class04025 L(class00753 var0) {
      return N(var0, class04684.N);
   }

   static class04025 i(class00753 var0) {
      return new class02214(var0);
   }

   static class04025 i() {
      return class04046.N;
   }

   static class04025 u() {
      return L(class00753.field_11176);
   }

   static class04025 u(class00753 var0) {
      return new class04304(var0);
   }

   static class04025 y(class00753 var0, List<class04651> var1) {
      return new class04041(var0, class03543.N(class04651::U, var1));
   }

   static class04025 y() {
      return N(class00753.field_11176);
   }

   static class04025 y(class00753 var0) {
      return new class04311(var0);
   }

   static class04025 y(List<class04025> var0) {
      return new class03317(var0);
   }

   static class04025 y(class04025... var0) {
      return y(List.of(var0));
   }

   static class04025 y(class04025 var0, class04025 var1) {
      return y(List.of(var0, var1));
   }

   class04054<?> N();

   static class04025 N(class00500 var0, class00753 var1) {
      return new class04048(var1, var0);
   }

   static class04025 N(class00753 var0, class07211 var1) {
      return new class03162(var0, var1);
   }

   static class04025 N(class07211 var0) {
      return N(class00753.field_11176, var0);
   }

   static class04025 N(class00891... var0) {
      return N(class00753.field_11176, var0);
   }

   static class04025 N(class00753 var0, class00891... var1) {
      return N(var0, List.of(var1));
   }

   static class04025 N(class00753 var0, List<class00891> var1) {
      return new class04052(var0, class03543.N(class00891::s, var1));
   }

   static class04025 N(class04025 var0, class04025 var1) {
      return N(List.of(var0, var1));
   }

   static class04025 N(class04025... var0) {
      return N(List.of(var0));
   }

   static class04025 N(List<class04025> var0) {
      return new class03312(var0);
   }

   static class04025 N(class00753 var0) {
      return new class04024(var0);
   }

   static class04025 N(class04025 var0) {
      return new class04029(var0);
   }

   static class04025 N(class04651... var0) {
      return N(class00753.field_11176, var0);
   }

   static class04025 N(class00753 var0, class03530<class00891> var1) {
      return new class03191(var0, var1);
   }

   static class04025 N(class03530<class00891> var0) {
      return N(class00753.field_11176, var0);
   }

   static class04025 N(class00753 var0, class04651... var1) {
      return y(var0, List.of(var1));
   }

   static class04025 R() {
      return i(class00753.field_11176);
   }
}
