import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JumExplicacaoComponent } from './jum-explicacao.component';

describe('JumExplicacaoComponent', () => {
  let component: JumExplicacaoComponent;
  let fixture: ComponentFixture<JumExplicacaoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JumExplicacaoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JumExplicacaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
