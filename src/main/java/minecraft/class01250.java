package minecraft;

import java.util.List;

public abstract class class01250 implements class01272 {
   private final class01055 y;

   @Override
   public String L() {
      return this.y.M();
   }

   @Override
   public boolean T() {
      List<class01055> list = this.j();
      int i = list.indexOf(this.y);
      return i > 0 && !list.get(i - 1).z();
   }

   public class01250(class01257 var1, class01055 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public boolean B() {
      return this.y.z();
   }

   @Override
   public boolean Z() {
      return this.y.Z();
   }

   @Override
   public class00392 i() {
      return this.y.L();
   }

   @Override
   public boolean b() {
      List<class01055> list = this.j();
      int i = list.indexOf(this.y);
      return i >= 0 && i < list.size() - 1 && !list.get(i + 1).z();
   }

   protected void n() {
      this.j().remove(this.y);
      this.y.U().N(this.v(), this.y, class01055::B, true);
      this.N.u.accept(this);
      this.N.L();
      this.t();
   }

   private void t() {
      if (this.y.M().equals("high_contrast")) {
         class04370<Boolean> class04370 = ((class05630)class06202.Nq().i_7).k();
         class04370.method_41748(!class04370.method_41753());
      }
   }

   protected abstract List<class01055> v();

   protected abstract List<class01055> j();

   @Override
   public class00392 u() {
      return this.y.y();
   }

   @Override
   public class01614 y() {
      return this.y.u();
   }

   @Override
   public void E() {
      this.N(-1);
   }

   @Override
   public class01894 N() {
      return this.N.L.apply(this.y);
   }

   protected void N(int var1) {
      List<class01055> list = this.j();
      int i = list.indexOf(this.y);
      list.remove(i);
      list.add(i + var1, this.y);
      this.N.u.accept(this);
   }

   @Override
   public void W() {
      this.N(1);
   }

   @Override
   public class01283 R() {
      return this.y.E();
   }
}
