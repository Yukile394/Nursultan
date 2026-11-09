package minecraft;

public interface class06611 {
   int N = -1;

   default boolean L() {
      return this.N() == 257 || this.N() == 32 || this.N() == 335;
   }

   default boolean M() {
      return this.N() == 262;
   }

   default boolean P() {
      return (this.y() & class06604.y) != 0;
   }

   default boolean T() {
      return this.N() == 67 && this.P() && !this.W() && !this.E();
   }

   default boolean B() {
      return this.N() == 265;
   }

   default boolean Z() {
      return this.N() == 264;
   }

   default boolean i() {
      return this.N() == 256;
   }

   default boolean b() {
      return this.N() == 86 && this.P() && !this.W() && !this.E();
   }

   default boolean s() {
      return this.N() == 65 && this.P() && !this.W() && !this.E();
   }

   default boolean m() {
      return (this.y() & 2) != 0;
   }

   default boolean j() {
      return this.N() == 88 && this.P() && !this.W() && !this.E();
   }

   default int U() {
      int i = this.N() - 48;
      return i >= 0 && i <= 9 ? i : -1;
   }

   default boolean z() {
      return this.N() == 258;
   }

   default boolean u() {
      return this.N() == 257 || this.N() == 335;
   }

   int y();

   default boolean E() {
      return (this.y() & 4) != 0;
   }

   int N();

   default boolean W() {
      return (this.y() & 1) != 0;
   }

   default boolean R() {
      return this.N() == 263;
   }
}
