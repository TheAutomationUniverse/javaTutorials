package p003_AccessModifierDifferentPackage;

import p002_AccessModifierSamePackage.SamePackageParent;

// different package - non-child classes - can access only public
public class DifferentPackageNonChild {

	public static void main(String[] args) {
		SamePackageParent samePackageParent = new SamePackageParent();
		System.out.println(samePackageParent.number1);
	}
}