package minecraft;

public class class00470 implements class07381 {
   private final class05623 N;
   private final class07932 y;

   @Override
   public boolean L() {
      return this.N.C_();
   }

   @Override
   public int L(int var1, class07403 var2) {
      this.y.N(var2, "Update player idle timeout from {} minutes to {} minutes", this.M(), var1);
      this.N.R(var1);
      return this.M();
   }

   @Override
   public boolean L(boolean var1, class07403 var2) {
      this.y.N(var2, "Update using allowlist from {} to {}", this.u(), var1);
      this.N.u(var1);
      this.N.yN();
      return this.u();
   }

   @Override
   public int M(int var1, class07403 var2) {
      this.y.N(var2, "Update status heartbeat interval from {} to {}", this.s(), var1);
      this.N.M(var1);
      return this.s();
   }

   @Override
   public int M() {
      return this.N.C();
   }

   @Override
   public boolean M(boolean var1, class07403 var2) {
      this.y.N(var2, "Update hides online players from {} to {}", this.b(), var1);
      this.N.M(var1);
      return this.b();
   }

   @Override
   public boolean P() {
      return this.N.Nz();
   }

   @Override
   public class06984 T() {
      return this.N.T();
   }

   public class00470(class05623 var1, class07932 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public boolean B(boolean var1, class07403 var2) {
      this.y.N(var2, "Update replies to status from {} to {}", this.j(), var1);
      this.N.R(var1);
      return this.j();
   }

   @Override
   public int B(int var1, class07403 var2) {
      this.y.N(var2, "Update entity broadcast range percentage from {}% to {}%", this.v(), var1);
      this.N.B(var1);
      return this.v();
   }

   @Override
   public boolean B() {
      return this.N.q();
   }

   @Override
   public int Z() {
      return this.N.F();
   }

   @Override
   public boolean i(boolean var1, class07403 var2) {
      this.y.N(var2, "Update force game mode from {} to {}", this.U(), var1);
      this.N.B(var1);
      return this.U();
   }

   @Override
   public int i() {
      return this.N.t();
   }

   @Override
   public int i(int var1, class07403 var2) {
      this.y.N(var2, "Update view distance from {} to {}", this.W(), var1);
      this.N.y(var1);
      return this.W();
   }

   @Override
   public boolean b() {
      return this.N.f();
   }

   @Override
   public int s() {
      return this.N.S();
   }

   @Override
   public int m() {
      return this.N.e();
   }

   @Override
   public int v() {
      return this.N.Ni();
   }

   @Override
   public boolean j() {
      return this.N.A();
   }

   @Override
   public boolean U() {
      return this.N.NR();
   }

   @Override
   public String z() {
      return this.N.x();
   }

   @Override
   public boolean u() {
      return this.N.D_();
   }

   @Override
   public int u(int var1, class07403 var2) {
      this.y.N(var2, "Update spawn protection radius from {} to {}", this.Z(), var1);
      this.N.i(var1);
      return this.Z();
   }

   @Override
   public boolean u(boolean var1, class07403 var2) {
      this.y.N(var2, "Update allow flight from {} to {}", this.B(), var1);
      this.N.i(var1);
      return this.B();
   }

   @Override
   public boolean y(boolean var1, class07403 var2) {
      this.y.N(var2, "Update enforce allowlist from {} to {}", this.L(), var1);
      this.N.L(var1);
      this.N.yN();
      return this.L();
   }

   @Override
   public class07086 y() {
      return this.N.yn().s();
   }

   @Override
   public int y(int var1, class07403 var2) {
      this.y.N(var2, "Update pause when empty from {} seconds to {} seconds", this.R(), var1);
      this.N.Z(var1);
      return this.R();
   }

   @Override
   public class07282 E() {
      return this.N.NM();
   }

   @Override
   public boolean N(boolean var1, class07403 var2) {
      this.y.N(var2, "Update autosave from {} to {}", this.N(), var1);
      this.N.m(var1);
      return this.N();
   }

   @Override
   public String N(String var1, class07403 var2) {
      this.y.N(var2, "Update MOTD from '{}' to '{}'", this.z(), var1);
      this.N.y(var1);
      return this.z();
   }

   @Override
   public int N(int var1, class07403 var2) {
      this.y.N(var2, "Update max players from {} to {}", this.i(), var1);
      this.N.u(var1);
      return this.i();
   }

   @Override
   public boolean N() {
      return this.N.yJ();
   }

   @Override
   public class06984 N(class06984 var1, class07403 var2) {
      this.y.N(var2, "Update operator user permission level from {} to {}", this.T(), var1.N());
      this.N.N(var1);
      return this.T();
   }

   @Override
   public class07086 N(class07086 var1, class07403 var2) {
      this.y.N(var2, "Update difficulty from '{}' to '{}'", this.y(), var1);
      this.N.N(var1);
      return this.y();
   }

   @Override
   public class07282 N(class07282 var1, class07403 var2) {
      this.y.N(var2, "Update game mode from '{}' to '{}'", this.E(), var1);
      this.N.y(var1);
      return this.E();
   }

   @Override
   public int W() {
      return this.N.V();
   }

   @Override
   public int R() {
      return this.N.NE();
   }

   @Override
   public int R(int var1, class07403 var2) {
      this.y.N(var2, "Update simulation distance from {} to {}", this.m(), var1);
      this.N.L(var1);
      return this.m();
   }

   @Override
   public boolean R(boolean var1, class07403 var2) {
      this.y.N(var2, "Update accepts transfers from {} to {}", this.P(), var1);
      this.N.Z(var1);
      return this.P();
   }
}
