package p003_AccessModifierDifferentPackage;

import p002_AccessModifierSamePackage.SamePackageParent;

// different package - child class - can access only public and protected(through inheritance)
public class DifferentPackageChild extends SamePackageParent {

	public static void main(String[] args) {
		SamePackageParent samePackageParent = new SamePackageParent();
		System.out.println(samePackageParent.number1);
//		System.out.println(samePackageParent.number2);	// 'protected' works only through inheritance across packages using extends keyword

		DifferentPackageChild differentPackageChild2 = new DifferentPackageChild();
		System.out.println(differentPackageChild2.number1);
		System.out.println(differentPackageChild2.number2);
	}
}