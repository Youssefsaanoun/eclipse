package servise;

import java.util.List;
import java.util.Optional;

import com.models.Etudiant;

public interface EtudiantServise {
	 
	

	   List<Etudiant> GetAllEtudiant();

	   Optional<Etudiant> getEudiantById(Long var1);

	   void DeleteEtudiant(Long var1);

	   void AddEtudiant(Etudiant var1);

	   Boolean modifEtudiant(Long var1, Etudiant var2);
	}
