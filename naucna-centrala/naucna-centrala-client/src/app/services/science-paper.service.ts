import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SciencePaperService {

  constructor(private httpClient: HttpClient) { }

  startProcess() {
    return this.httpClient.get('/api/magazine/form');
  }
  selectMagazine(taskId, dto) {
    return this.httpClient.post('/api/magazine/select-magazine/'.concat(taskId), dto);
  }
  save(taskId, dto) {
    return this.httpClient.post('/api/science-paper/'.concat(taskId), dto, {responseType: 'text'});
  }

  savePdf(sciencePaperId, fileToUpload) {
    const formData: FormData = new FormData();
    formData.append('file', fileToUpload);
    console.log(formData);
    return this.httpClient.put('/api/science-paper/'.concat(sciencePaperId), formData, {responseType: 'text'});
  }
  download(processId) {
    const httpOptions = {
      'responseType'  : 'arraybuffer' as 'json'
    };
    return this.httpClient.get('/api/science-paper/download/'.concat(processId), httpOptions);
  }
  paperReview(taskId, dto) {
    return this.httpClient.put('/api/task/paper-review/'.concat(taskId), dto, {responseType: 'text'});
  }

  paperFormat(taskId, dto) {
    return this.httpClient.put('/api/science-paper/paper-format/'.concat(taskId), dto, {responseType: 'text'});
  }

  chooseReviewers(taskId, dto) {
    return this.httpClient.put('/api/task/choose-reviewers/'.concat(taskId), dto, {responseType: 'text'});
  }
  chooseOtherReviewers(taskId, dto) {
    return this.httpClient.put('/api/task/choose-other-reviewers/'.concat(taskId), dto, {responseType: 'text'});
  }
  chiefOrEditorChoice(taskId, dto) {
    return this.httpClient.put('/api/users/chief-or-editor-review/'.concat(taskId), dto, {responseType: 'text'});
  }

  paperCorrection(taskId, dto) {
    return this.httpClient.put('/api/science-paper/paper-correction/'.concat(taskId), dto, {responseType: 'text'});
  }
}
