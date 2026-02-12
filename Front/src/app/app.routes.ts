import { Routes } from '@angular/router';
import { InsertarEntidadComponent } from './components/insertar-entidad/insertar-entidad.component';
import { ListarEntidadesComponent } from './components/listar-entidades/listar-entidades.component';

export const routes: Routes = [
  { path: '', redirectTo: 'listar', pathMatch: 'full' },
  { path: 'listar', component: ListarEntidadesComponent },
  { path: 'insertar', component: InsertarEntidadComponent }
];
