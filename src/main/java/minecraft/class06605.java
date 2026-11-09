package minecraft;

import com.google.common.collect.Lists;
import java.util.List;

public class class06605 implements class06633 {
   private final List<class06633> N = Lists.newArrayList();

   @Override
   public void L() {
      this.N.forEach(class06633::L);
   }

   @Override
   public void L(class08774 var1) {
      this.N.forEach(var1x -> var1x.L(var1));
   }

   public class06605() {
      super();
   }

   @Override
   public void i() {
      this.N.forEach(class06633::i);
   }

   @Override
   public void u() {
      this.N.forEach(class06633::u);
   }

   @Override
   public void y(class08774 var1) {
      this.N.forEach(var1x -> var1x.y(var1));
   }

   @Override
   public void y(class01087 var1) {
      this.N.forEach(var1x -> var1x.y(var1));
   }

   @Override
   public void y() {
      this.N.forEach(class06633::y);
   }

   @Override
   public void y(class04770 var1) {
      this.N.forEach(var1x -> var1x.y(var1));
   }

   @Override
   public void N(class04770 var1) {
      this.N.forEach(var1x -> var1x.N(var1));
   }

   @Override
   public void N(class05157 var1) {
      this.N.forEach(var1x -> var1x.N(var1));
   }

   public void N(class06633 var1) {
      this.N.add(var1);
   }

   @Override
   public void N() {
      this.N.forEach(class06633::N);
   }

   @Override
   public void N(String var1) {
      this.N.forEach(var1x -> var1x.N(var1));
   }

   @Override
   public void N(class01072 var1) {
      this.N.forEach(var1x -> var1x.N(var1));
   }

   @Override
   public void N(class01087 var1) {
      this.N.forEach(var1x -> var1x.N(var1));
   }

   @Override
   public void N(class08774 var1) {
      this.N.forEach(var1x -> var1x.N(var1));
   }

   @Override
   public <T> void N(class06839<T> var1, T var2) {
      this.N.forEach(var2x -> var2x.N(var1, var2));
   }

   @Override
   public void R() {
      this.N.forEach(class06633::R);
   }
}
