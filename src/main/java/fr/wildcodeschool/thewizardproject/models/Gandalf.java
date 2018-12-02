package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Gandalf implements WizardInterface {
	private OutfitInterface outfit;
	
	
    public Gandalf(OutfitInterface injectedOutfit) {
        outfit = injectedOutfit;
    }
	
	@Override
	public String giveAdvice() {
		return "You shall not pass!";
	}
	
	@Override
	public String revealDress() {
		return this.outfit.revealDress();
	}
}
