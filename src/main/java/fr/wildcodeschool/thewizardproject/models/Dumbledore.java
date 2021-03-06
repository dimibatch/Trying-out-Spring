package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Dumbledore implements WizardInterface {
	private OutfitInterface outfit;
	
	
    public Dumbledore(OutfitInterface injectedOutfit) {
        outfit = injectedOutfit;
    }
	
	@Override
	public String giveAdvice() {
		return "Hear my wise words, young man!";
	}
	
	@Override
	public String revealDress() {
		return this.outfit.revealDress();
	}
}
